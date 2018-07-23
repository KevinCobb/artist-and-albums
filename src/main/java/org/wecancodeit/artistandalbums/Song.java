package org.wecancodeit.artistandalbums;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Song {

	@Id
	@GeneratedValue
	private Long songId;

	private String songName;
	private String songLength;
	@Lob
	private String lyrics;
	private String videoUrl;
	private String rating;

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
		this.rating = songRating;
		this.album = album;
	}

	public Long getSongId() {
		return songId;
	}

	public String getSongName() {
		return songName;
	}

	public String getSongLength() {
		return songLength;
	}

	public String getSongRating() {
		return rating;
	}

	public Album getAlbum() {
		return album;
	}

	public Collection<SongComment> getSongComment() {
		return songComment;
	}

	public String getLyrics() {
		return lyrics;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public String getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Song [name=" + songName + ", song Length=" + songLength + ", lyrics=" + lyrics + ", videoUrl="
				+ videoUrl + ", rating=" + rating + "]";

	}
}
