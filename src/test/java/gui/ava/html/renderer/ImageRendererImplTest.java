package gui.ava.html.renderer;

import gui.ava.html.BaseTest;
import gui.ava.html.parser.HtmlParserImpl;
import org.junit.Before;
import org.junit.Test;

import java.io.FileOutputStream;

/**
 * @author Yoav Aharoni
 */
public class ImageRendererImplTest extends BaseTest {
	private HtmlParserImpl parser;
	private ImageRendererImpl renderer;

	@Before
	public void createParser() {
		parser = new HtmlParserImpl();
		renderer = new ImageRendererImpl(parser);
	}

	@Test
	public void testSaveStream() throws Exception {
		parser.load(getTest1Url());
		renderer.saveImage(new FileOutputStream("test-out/file1.png"), true);
	}

	@Test
	public void testSaveFile() throws Exception {
		parser.load(getTest1Url());
		renderer.saveImage("test-out/test.gif");
		renderer.saveImage("test-out/test.png");
		renderer.saveImage("test-out/test.jpg");
		renderer.saveImage("test-out/test.bmp");
	}
}
