# java-html2image
Forked and updated from [this repository](https://github.com/hkirk/java-html2image)

## Html2Image

This simple Java library converts plain HTML markup to image and provides client-side image-map using HTML <map> element.

#### Features
- Create images/pdf from HTML/CSS
- Supports HTML file, Document, HTML String, Web URL, Reader, InputStream
- Supports JPEG, GIF, PNG, BMP, PDF
- Can generate HTML file embedding previously generated image

#### Basic Usage

Get a BufferedImage from HTML file:
```java
BufferedImage image = Html2Image.fromFile(htmlFile)
    .getImageRenderer()
    .getBufferedImage();
```

Save generated image:
```java
Html2Image.fromFile(htmlFile)
    .getImageRenderer()
    .saveImage(outFile);
```

Create and save PDF to OutputStream:
```java
Html2Image.fromFile(htmlFile)
    .getPdfRenderer()
    .saveToPDF(pdfOutputStream);
```

#### Download

```xml
<dependency>
  <groupId>gui.ava</groupId>
  <artifactId>html2image</artifactId>
  <version>2.0-SNAPSHOT</version>
</dependency>
```

License: GNU Lesser GPL
