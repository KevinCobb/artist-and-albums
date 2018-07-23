package org.wecancodeit.artistandalbums;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Album {
	@Id
	@GeneratedValue
	private Long albumId;

	private String albumName;
	private String albumReleaseDate;
	private String albumSongList;
	private String albumGenre;
	private String albumCoverImg;

	@OneToMany(mappedBy = "album")
	public Collection<Song> songs;

	@OneToMany(mappedBy = "album")
	public Collection<AlbumComment> albumComments;

	@ManyToOne
	public Artist artist;

	public Album() {
	}

	public Album(String albumName, String albumReleaseDate, String albumSongList, String albumGenre, String albumCoverImg,
			Artist artist) {
		this.albumName = albumName;
		this.albumReleaseDate = albumReleaseDate;
		this.albumSongList = albumSongList;
		this.albumGenre = albumGenre;
		this.albumCoverImg = albumCoverImg;
		this.artist = artist;
	}

	public Collection<Song> getSongs() {
		return songs;
	}
	public Collection<AlbumComment> getAlbumComments() {
		return albumComments;
	}
	public String getName() {
		return albumName;
	}

	public String getReleaseDate() {
		return albumReleaseDate;
	}

	public Long getAlbumId() {
		return albumId;
	}

	public String getAlbumSongList() {
		return albumSongList;
	}

	public String getAlbumName() {
		return albumName;
	}
	
	public String getAlbumReleaseDate() {
		return albumReleaseDate;
	}
	
	
	public String getAlbumGenre() {
		return albumGenre;
	}
	
	public String getAlbumCoverImg() {
		return albumCoverImg;
	}
	
	
	public Artist getArtist() {
		return artist;
	}
	@Override
	public String toString() {
		return "Album [name=" + albumName + ", releaseDate=" + albumReleaseDate + ", songs=" + albumSongList + ", genre="
				+ albumGenre + ", coverImg=" + albumCoverImg + ", Artist=" + artist + "]";
	}

}
