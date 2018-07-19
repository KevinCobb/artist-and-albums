package org.wecancodeit.artistandalbums;

import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long>{

	Artist findById(Long id);

	Album save(Album album);

}
