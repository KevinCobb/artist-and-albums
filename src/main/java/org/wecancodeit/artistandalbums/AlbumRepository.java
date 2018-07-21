package org.wecancodeit.artistandalbums;

import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long>{

//	Album save(Album album);

	Artist findById(Long id);

}
