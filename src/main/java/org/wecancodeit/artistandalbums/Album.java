package org.wecancodeit.artistandalbums;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Album {
	@Id
	@GeneratedValue
	
	private Long id;
	private String albumName;
	private String albumReleaseDate;
	private String albumSong;
	private String albumGenre;
	private String albumCoverImg;
	private String Artist;
	
	@OneToMany(mappedBy="album")
	private Collection<Song> songs;
	@OneToMany(mappedBy="album")
	private Collection<AlbumComment> albumComments;

	public Album() {
	}
	
	public Album(String albumname, String albumReleaseDate, String albumSong, String albumGenre, String coverImg, Artist artist) {
		this.albumName = albumname;
		this.albumReleaseDate = albumReleaseDate;
		this.albumSong = albumSong;
		this.albumGenre = albumGenre;
		this.albumCoverImg = coverImg;
	}

	public String getName() {
		return albumName;
	}

	public String getReleaseDate() {
		return albumReleaseDate;
	}

	public String getSongs() {
		return albumSong;
	}

	public String getGenre() {
		return albumGenre;
	}

	public String getCoverImg() {
		return albumCoverImg;
	}
	
	@Override
	public String toString() {
		return "Album [name=" + albumName + ", releaseDate=" + albumReleaseDate + ", songs=" + albumSong + ", genre=" + albumGenre
				+ ", coverImg=" + albumCoverImg + ", Artist=" + Artist + "]";
	}
	
	
}