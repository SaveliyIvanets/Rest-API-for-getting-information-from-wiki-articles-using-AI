package spring.firstRestApi1.Service;
import org.springframework.stereotype.Service;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ArrayList;

@Service
public class Parser {
    public String goParcing(String link){
        try {

            Document doc = Jsoup.connect(link).get();
            Elements wikiBody = doc.select("div#bodyContent.vector-body");
            String parseWikiText = wikiBody.text();

            //Сокращаю статью до 30000 символов, тк Gpt не может больше принять
            StringBuilder sb = new StringBuilder();
            char[] charArray = parseWikiText.toCharArray();
            for(int i = 0; i < charArray.length; i++){
                if(i > 30000){
                    break;
                }
                sb.append(charArray[i]);
            }

            return  sb.toString();
        }catch (IOException e){
            return "Not correct link";
        }
    }
}
