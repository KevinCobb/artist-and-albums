package org.wecancodeit.artistandalbums;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AlbumComment {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Album album;


  private String albumComment;


public AlbumComment(Album album, String albumComment) {
	this.album = album;
	this.albumComment = albumComment;
}


public Album getAlbum() {
	return album;
}


public String getAlbumComment() {
	return albumComment;
}
  
  
  
}