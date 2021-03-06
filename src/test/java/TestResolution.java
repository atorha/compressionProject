
import static org.junit.jupiter.api.Assertions.*;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.junit.jupiter.api.Test;

import Compress.compress;

class TestResolution {
	String linkOfSmallFile="./src/test/resources/testFileSmall.jpeg";
	String linkOfSmallCompressedFile="./src/test/resources/testCompressed/testFileSmall_compr.jpeg";
	String linkOfBigFile="./src/test/resources/testFileBig.jpeg";
	String linkOfBigCompressedFile="./src/test/resources/testCompressed/testFileBig_compr.jpeg";

	

	Image smallImage;
	Image smallCompressedImage;
	Image bigImage;
	Image bigCompressedImage;

	@Test
	public void testCompressResolutionResizingToSmallResolution() throws IOException { 
		try {
			new compress(linkOfSmallFile, "./src/test/resources/testCompressed");
			smallImage= new ImageIcon(ImageIO.read(new File(linkOfSmallFile))).getImage();
			smallCompressedImage  = new ImageIcon(ImageIO.read(new File(linkOfSmallCompressedFile))).getImage();
			assertEquals(smallImage.getHeight(null), smallCompressedImage.getHeight(null), "The small images got compressed, even though they should not get compressed.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testCompressResolutionResizingBigFile() throws IOException { 
		try {
			new compress(linkOfBigFile, "./src/test/resources/testCompressed");
			bigImage= new ImageIcon(ImageIO.read(new File(linkOfBigFile))).getImage();
			bigCompressedImage  = new ImageIcon(ImageIO.read(new File(linkOfBigCompressedFile))).getImage();
			assertEquals(bigImage.getHeight(null)/2, bigCompressedImage.getHeight(null), "The small images got compressed, even though they should not get compressed.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


