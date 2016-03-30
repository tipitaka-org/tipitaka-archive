package org.tipitaka.archive;

import java.io.IOException;

import org.tipitaka.archive.Notes.Version;

/**
 * Created by cmeier on 3/6/16.
 */
public interface NGBuilder extends BaseBuilder
{

  void startDocument() throws IOException;
  void endDocument() throws IOException;

  void startMetadata() throws IOException;
  void endMetadata() throws IOException;

  void normativeSource(String url);
  void archivePath(String path);
  void title(String title);

  void startBody() throws IOException;
  void endBody() throws IOException;

  void startNikaya() throws IOException;
  void endNikaya() throws IOException;

  void startBook() throws IOException;
  void endBook() throws IOException;

  void startChapter() throws IOException;
  void endChapter() throws IOException;

  void startCentered() throws IOException;
  void endCentered() throws IOException;

  void startSubhead() throws IOException;
  void endSubhead() throws IOException;

  void startIndent() throws IOException;
  void endIndent() throws IOException;

  void startBold() throws IOException;
  void endBold() throws IOException;

  void startParagraph(String number) throws IOException;
  void endParagraph() throws IOException;

  void startHangnum(String number) throws IOException;
  void endHangnum() throws IOException;

  void startGatha(String number) throws IOException;
  void endGatha(String substring) throws IOException;

  void pageBreak(String edition, String number) throws IOException;

  void startNote() throws IOException;
  void endNote() throws IOException;

  void startAlternatives(final String extra, final boolean hasSeparator) throws IOException;
  void endAlternatives() throws IOException;

  void beginAlternative(String source);
  void finalizeAlternative(String text);

  void startTitle() throws IOException;
  void endTitle() throws IOException;
}
