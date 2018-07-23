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
	public Collection<Artist> getArtists() {
		return (Collection<Artist>) artistRepo.findAll();
	}
	@RequestMapping("/albums")
	public Collection<Album> getAlbumsId() {
		return (Collection<Album>) albumRepo.findAll();
	}
	@RequestMapping("/songs")
	public Collection<Song> getSongs() {
		return (Collection<Song>) songRepo.findAll();
	}
	@RequestMapping("/artist/{id}/albums")
	public Collection<Album> getAlbumId(@PathVariable(name = "albumId") Long albumId) {
		return (Collection<Album>) artistRepo.findById(albumId).getAlbums();
	}

	// Add endpoint to handle DELETEing a comment
//	@RequestMapping(value = "/artists/{id}/comments", method = RequestMethod.DELETE)
//	public Collection<Artist> deleteComment(@PathVariable(name = "id") String name,
//			@RequestParam(value = "id") Long id) {
//		albumCommentRepo.delete(id);
//		return artistRepo.findOne(id).getAlbumComments();
//	}

//	@RequestMapping(value = "/artists/{id}/{songId}")
//	public Collection<Song> getSongs(@PathVariable(name = "songId")Long SongId,
//									@PathVariable(name="id")Long id) {
//		return albumRepo.findOne(id).getSongs();
//	}
//	@RequestMapping(value = "/artist/add-artist", method = RequestMethod.POST)
//	public String addArtist(@RequestParam String artistName, @RequestParam String artistAlbum,
//			@RequestParam String recordLabel) {
//		if (artistRepo.findById(id) == null) {
//			Artist artistToAdd = artistRepo.save(new Artist(artistName, artistAlbum, recordLabel, null));
//		}
//		return "redirect:/artists";
//}
//	
//	@RequestMapping(value = "/artists/{id}/add-album-to-artist", method = RequestMethod.POST)
//	public String addAlbum(@PathVariable(name = "id")Long id, String album , @RequestParam String AlbumName,
//			@RequestParam String artistSong, @RequestParam String albumReleaseDate, @RequestParam String albumSong, @RequestParam albumGenre, @RequestParam albumCoverImg) {
//		Artist artist = artistRepo.findById(id);
//		if (artist != null) {
//			if (albumRepo.findByName(AlbumName) == null) {
//				Album albumToAdd = albumRepo.save(new Album(AlbumName, albumReleaseDate, albumSong, albumGenre, albumCoverImg, artist));
//			}
//		}
//		return "redirect:/artists/" + album;

	}


