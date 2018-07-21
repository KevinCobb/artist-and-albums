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
	private Long id;

	private String albumName;
	private String albumReleaseDate;
	private String albumSong;
	private String albumGenre;
	private String albumCoverImg;

	@OneToMany(mappedBy = "album")
	private Collection<Song> songs;

	@OneToMany(mappedBy = "album")
	private Collection<AlbumComment> albumComments;

	@ManyToOne
	public Artist artist;

	public Album() {
	}

	public Album(String albumName, String albumReleaseDate, String albumSongList, String albumGenre, String coverImg,
			Artist artist) {
		this.albumName = albumName;
		this.albumReleaseDate = albumReleaseDate;
		this.albumSong = albumSongList;
		this.albumGenre = albumGenre;
		this.albumCoverImg = coverImg;
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

	public String getSongs() {
		return albumSong;
	}

	public String getGenre() {
		return albumGenre;
	}

	public String getCoverImg() {
		return albumCoverImg;
	}

	public Long getId() {
		return id;
	}
	
	public String getAlbumName() {
		return albumName;
	}
	
	public String getAlbumReleaseDate() {
		return albumReleaseDate;
	}
	
	public String getAlbumSong() {
		return albumSong;
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
		return "Album [name=" + albumName + ", releaseDate=" + albumReleaseDate + ", songs=" + albumSong + ", genre="
				+ albumGenre + ", coverImg=" + albumCoverImg + ", Artist=" + artist + "]";
	}

}
