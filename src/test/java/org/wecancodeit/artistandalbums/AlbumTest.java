package org.wecancodeit.artistandalbums;

import org.junit.Assert;
import org.junit.Test;



public class AlbumTest {
	
	private String albumName;
	private String albumReleaseDate;
	private String albumSong;
	private String albumGenre;
	private String albumCoverImg;
	private String Artist;



	Album someName = new Album();
		

		@Test
		public void testAlbumExistsButIsNull() {
			Artist testAlbum = null;
			Assert.assertNull(testAlbum);
		}

		@Test
		public void testAlbumExistsButIsNotNull() {
			Album testAlbum = new Album();
			Assert.assertNotNull(testAlbum);
		}

		@Test
		public void testAlbumHasName() {
			Assert.assertEquals("AlbumName", someName.getName());
		}

		@Test
		public void testAlbumHasReleaseDate() {
			Assert.assertEquals("ReleaseDate", someName.getReleaseDate());
		}

		@Test
		public void testWhenICreateAnAlbumICanIncludeAlbumNameAndReleaseDate() {
			Assert.assertEquals("AlbumName", someName.getName());
			Assert.assertEquals("ReleaseDate", someName.getReleaseDate());
		}

		@Test
		public void testWhenICreateAnAlbumICanIncludeAlbumNameReleaseDateAndSong() {
			Assert.assertEquals("AlbumName", someName.getName());
			Assert.assertEquals("ReleaseDate", someName.getReleaseDate());
			Assert.assertEquals("Song", someName.getSongs());

		}

		@Test
		public void testWhenICreateAnAlbumICanIncludeAlbumNameReleaseDateSongAndGenre() {
			Assert.assertEquals("AlbumName", someName.getName());
			Assert.assertEquals("ReleaseDate", someName.getReleaseDate());
			Assert.assertEquals("Song", someName.getSongs());
			Assert.assertEquals("Genre", someName.getGenre());
			Assert.assertEquals("CoverImage", someName.getCoverImg());
		
	}
}
