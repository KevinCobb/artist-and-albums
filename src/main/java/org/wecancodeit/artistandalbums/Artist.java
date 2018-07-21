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
	private long id;

	private String artistName;
	private String artistRecordLabel;

	@OneToMany(mappedBy = "artist")
	public Collection<Album> albums;

	public Artist() {
	}

	public Artist(String artistName, String recordLabel) {
		this.artistName = artistName;
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

	public String getArtistRecordLabel() {
		return artistRecordLabel;
	}

}
