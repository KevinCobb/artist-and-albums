package org.wecancodeit.artistandalbums;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Song {
	
	@Id
	@GeneratedValue
	
	private String songName;
	private int songLength;
	private String lyrics;
	private String songVideoUrl;
	private String songRating;
	
	
	@ManyToOne
	private Album album;
	
	public Song() {
		
	}
	public Song(String name, int length, String lyrics, String videoUrl, String rating, Album album) {
		this.songName = name;
		this.songLength = length;
		this.lyrics = lyrics;
		this.songVideoUrl = videoUrl;
		this.songRating = rating;
	}
//	public Collection getAlbum() {
//		return Album;
//	}
	public String getName() {
		return songName;
	}
	public int getLength() {
		return songLength;
	}
	public String getLyrics() {
		return lyrics;
	}
	public String getVideoUrl() {
		return songVideoUrl;
	}
	public String getRating() {
		return songRating;
	}
	
	@Override
	public String toString() {
		return "Song [name=" + songName + ", length=" + songLength + ", lyrics=" + lyrics + ", videoUrl=" + songVideoUrl
				+ ", rating=" + songRating + "]";
	
	}
}
