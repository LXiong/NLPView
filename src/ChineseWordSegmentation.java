




import edu.fudan.ml.types.Dictionary;
import edu.fudan.nlp.cn.tag.CWSTagger;



public class ChineseWordSegmentation {
	
	public String WordSegmentation(String News) throws Exception{ 
		 String segmentation="";  
		//CWSTagger tag = new CWSTagger("./models/seg.m");
		
				CWSTagger tag3 = new CWSTagger("./models/seg.m", new Dictionary("./models/dict_ambiguity.txt",true));
				//��������ʵ䣬����ʵ����С��������������ˡ��͡��ˡ�, ��ʹ��Viterbi��������������
				//System.out.println("\nʹ�ò��ϸ�Ĵʵ�ķִʣ�");
				String str3 = News;
				String s3 = tag3.tag(str3);
				System.out.println(s3);
				segmentation=s3;  
				 return segmentation;  
		
	}

}
