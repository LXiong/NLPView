

import java.util.ArrayList;

import edu.fudan.ml.types.Dictionary;
import edu.fudan.nlp.cn.tag.CWSTagger;
import edu.fudan.nlp.cn.tag.POSTagger;

/**
 * ���Ա�עʹ��ʾ��
 * @author xpqiu
 *
 */
public class PartsOfSpeechTag {
	
	static POSTagger tag;

	/**
	 * ������
	 * @param args
	 * @throws IOException 
	 * @throws  
	 */
	 public ArrayList<String> SpeechTag(String news) throws Exception{  
		 ArrayList<String> speech=new ArrayList<String>();  
		
		CWSTagger cws = new CWSTagger("./models/seg.m");
		tag = new POSTagger(cws,"models/pos.m");
	
		String str = news;
		System.out.println(tag.tag(str));
		String str2=tag.tag(str).toString();
		speech.add(str2); 
		 return speech;
	}

}
