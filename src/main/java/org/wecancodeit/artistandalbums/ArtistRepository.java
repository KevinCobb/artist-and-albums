package org.wecancodeit.artistandalbums;

import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
	
	Artist findById(Long id);

}
