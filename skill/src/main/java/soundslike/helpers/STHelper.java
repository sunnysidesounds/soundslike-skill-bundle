package soundslike.helpers;

import org.stringtemplate.v4.NumberRenderer;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STRawGroupDir;
import soundslike.SoundsLikeFreeSoundClient;

import java.io.File;
import java.net.URL;
import java.util.Arrays;

public class STHelper {

	public static STGroup group;

	/**
	 * Loads a string template from out templates directory...
	 * @param name name of the template
	 * @return StringTemplate
	 */
	public static ST loadTemplate(String name) {
		File templateFolder = null;
		ClassLoader classLoader = SoundsLikeFreeSoundClient.class.getClassLoader();
		URL resource = classLoader.getResource("phrases");
		if(resource != null){
			String url = resource.getFile();
			templateFolder = new File(url);
			if(!templateFolder.exists()){
				System.out.println("Template path doesn't exist ");
			}
		} else {
			System.out.println("Resource doesn't exist : templateFolder is null");
		}
		return STHelper.getStringTemplateFolder(templateFolder).getInstanceOf(name);
	}

	/**
	 * This gets the string template,
	 * @param inputDir directory of string templates
	 * @return STGroup
	 */
	public static STGroup getStringTemplateFolder(File inputDir) {
		if (null == group) {
			group =
					new STRawGroupDir(inputDir.getAbsolutePath(), '$', '$');
			group.registerRenderer(Number.class, new NumberRenderer());
		}
		return group;
	}

}
