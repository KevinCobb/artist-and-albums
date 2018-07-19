package org.wecancodeit.artistandalbums;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")

public class ApiController {
	

		@Autowired
		ArtistRepository artistRepo;

		@Autowired
		AlbumRepository albumRepo;
		
		@Autowired
		SongRepository songRepo;
		
		@Autowired
		SongCommentRepository songCommentRepo;
		
		@Autowired
		AlbumCommentRepository albumCommentRepo;
		
		@RequestMapping("/artists")
		public Collection<Artist> getArtist() {
			return (Collection<Artist>) artistRepo.findAll();
		}
		@RequestMapping("/Artists/{id}/albums")
		public Collection<Album> getAlbums(@PathVariable(name = "id") Long id) {
			return (Collection<Album>) artistRepo.findById(id).getAlbums();
		}

		// Add endpoint to handle DELETEing a comment
		@RequestMapping(value = "/artists/{id}/comments", method = RequestMethod.DELETE)
		public Collection<Artist> deleteComment(@PathVariable(name = "id") String name, @RequestParam(value = "id") Long id) {
			albumCommentRepo.delete(id);
			return artistRepo.findById(id).getAlbumComments();
		}

}
