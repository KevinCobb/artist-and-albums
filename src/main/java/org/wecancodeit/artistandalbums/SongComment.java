package org.wecancodeit.artistandalbums;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class SongComment {
	@Id
	@GeneratedValue
	
	private String comment;

}
