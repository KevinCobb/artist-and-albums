package org.wecancodeit.artistandalbums;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@Autowired
	ArtistRepository artistRepo;
	
	@Autowired
	AlbumRepository albumRepo;
	
	@Autowired
	SongRepository songRepo;
	
	@Autowired
	SongCommentRepository songCommentrepo;
	
	@Autowired 
	AlbumCommentRepository albumcommentrepo;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/Artist";
	}
	
	@RequestMapping("/Artist")
	public String getArtists(Model model) {
		model.addAttribute("artists", artistRepo.findAll());
		return "artists";
	}
	
	@RequestMapping("/artists/{id}")
	public String getArtist(@PathVariable(name = "id")Long id, Model model) {
		model.addAttribute("artist", artistRepo.findById(id));
		return "artist";
	}
	
	@RequestMapping("/artists/{id}/albums/{id}")
	public String getAlbum(@PathVariable(name = "album") String album, @PathVariable(name = "id") Long id,
			Model model) {
		model.addAttribute("album", albumRepo.findOne(id));
		return "album";
	}
	
	@RequestMapping("/artists/{id}/song")
	public String getSong(@PathVariable(name = "Song") String song, Model model) {
		model.addAttribute("song", songRepo.findAll());
		return "song";
	}
	
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
//
//	}
}
