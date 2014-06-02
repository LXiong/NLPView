

import java.util.ArrayList;

import edu.fudan.nlp.cn.anaphora.Anaphora;

/**
 * ָ������ʵ��
 * @author jszhao
 * @version 1.0
 * @since FudanNLP 1.5
 */
public class AnaphoraResolution {
	 public ArrayList<String> Resolution(String news) throws Exception{ 
		 ArrayList<String> keywords=new ArrayList<String>();  
		String str = news;
		Anaphora aa = new Anaphora("./models/seg.m","./models/pos.m","./models/ar.m");
	
		System.out.printf(aa.resultToString(str));
		keywords.add(aa.resultToString(str));
		/*String str2 = "������ѧ������1905��,��λ���Ϻ��У������ѧ�����˺ö������ѧ����";
		String str3[] = {"����","��ѧ","����","��","1905��","��","��","λ��","�Ϻ���","��","���","��ѧ","����","��","�ö�","����","��","ѧ��","��"};
		String str4[] = {"ʵ����","����","����","���","ʱ�����","���","����","����","ʵ����","���","�޶���","����","����","��̬����","����","���ݴ�","�ṹ����","����","���"};
		String str5[][][] = new String[1][2][str3.length];
		str5[0][0] = str3;
		str5[0][1] = str4;		
		System.out.printf(aa.resultToString(str5, str2));
		*/
		return keywords; 
	}

}
