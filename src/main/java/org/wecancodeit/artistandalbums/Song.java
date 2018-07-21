package org.wecancodeit.artistandalbums;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Song {

	@Id
	@GeneratedValue
	private Long id;

	private String songName;
	private String songLength;
	private String lyrics;
	private String videoUrl;
	private String songRating;

	@ManyToOne
	private Album album;

	@OneToMany(mappedBy = "song")
	public Collection<SongComment> songComment;

	public Song() {

	}

	public Song(String songName, String songLength, String lyrics, String videoUrl, String songRating, Album album) {
		this.songName = songName;
		this.songLength = songLength;
		this.lyrics = lyrics;
		this.videoUrl = videoUrl;
		this.songRating = songRating;
	}

//	public Collection getAlbum() {
//		return Album;
//	}
	public String getName() {
		return songName;
	}

	public String getLength() {
		return songLength;
	}

	public String getLyrics() {
		return lyrics;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public String getRating() {
		return songRating;
	}

	@Override
	public String toString() {
		return "Song [name=" + songName + ", song Length=" + songLength + ", lyrics=" + lyrics + ", videoUrl="
				+ videoUrl + ", rating=" + songRating + "]";

	}
}
