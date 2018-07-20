package org.wecancodeit.artistandalbums;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SongComment {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Song song;

	private String songComment;

	public SongComment(String songComment) {
		this.songComment = songComment;
	}
	
	public String getComment() {
		return songComment;
	}


}
