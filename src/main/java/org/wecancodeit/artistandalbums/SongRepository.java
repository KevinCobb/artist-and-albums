package org.wecancodeit.artistandalbums;

import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long>{

	Song findBySongId(Long songId);

}
