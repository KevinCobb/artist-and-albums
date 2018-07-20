package org.wecancodeit.artistandalbums;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Artist {
	@Id
	@GeneratedValue

	private String artistName;
	private String artistAlbum;
	private String artistRecordLabel;
	private String artistSong;
	private long id;

	@OneToMany(mappedBy = "artist")
	public Collection<Album> albums;

	public Artist() {
	}

	public Artist(String name, String recordLabel) {
		this.artistName = name;
		this.artistRecordLabel = recordLabel;
	}

	public Collection<Album> getAlbums() {
		return albums;
	}

	public String getRecordLabel() {
		return artistRecordLabel;
	}

	public Collection<Artist> getAlbumComments() {
		return getAlbumComments();
	}

	public Long getId() {
		return id;
	}

	public String getArtistName() {
		return artistName;
	}

	public String getArtistAlbum() {
		return artistAlbum;
	}

	public String getArtistRecordLabel() {
		return artistRecordLabel;
	}

	public String getArtistSong() {
		return artistSong;
	}

}
