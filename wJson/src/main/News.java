package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import domain.ItemVo;
import domain.ResponseVO;

public class News {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String clientId = "mBQo41s39Dcpi8v2Lokj"; // 발급받은 클라이언트 ID를 넣습니다.
		String clientSecret = "aEmxdDAD8a"; // 발급받은 클라이언트 Secret 를 넣습니다.
		String apiURL = "https://openapi.naver.com/v1/search/news.json";

		System.out.println("뉴스내용을 입력하세요");
		String word = in.nextLine(); // 성인검색어인지를 판별할 검색어

		try {
			word = URLEncoder.encode(word, "UTF-8");
			apiURL += "?query=" + word;

			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);

			int responseCode = con.getResponseCode();

			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();

			String json = response.toString();
			System.out.println(json);
			
			Gson gson = new Gson();
			ResponseVO res = gson.fromJson(json, ResponseVO.class);
			List<ItemVo> items = res.getItems();
			
			for(ItemVo item : items) {
            	System.out.println(item.getTitle() + "[" + item.getPubDate() + "]");
            }
			
			//json 파서를 가져와서 파싱한다.
			JsonParser parser = new JsonParser();
			//파싱한 결과를 json element로 저장한다.
			// JsonElement은 Array이든 Object든 다 담을 수 있는 것이다.
			JsonElement element = parser.parse(json);
			//json element를 object로 가져와서 거기서 total이라는 속서을 가져온뒤
			//해당 값을 정수형으로 가져온다.
			// element에서 getAsJsonObject()로 Object를 가져온다. 거기서 total가져온다. 그런데 total은 int형이니까
			// getAsInt로 가져온다.
			// 만약 items를 가져오고싶다면 getAsInt가 아니라 getAsJsonArray로 가져와야 한다.
			int total = element.getAsJsonObject().get("total").getAsInt();

			System.out.println(total);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("API호출중 오류 발생");
		}
		in.close();
	}
}
