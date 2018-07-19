package org.wecancodeit.artistandalbums;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class AlbumComment {
	
	@ManyToOne
	private Album album;

}
