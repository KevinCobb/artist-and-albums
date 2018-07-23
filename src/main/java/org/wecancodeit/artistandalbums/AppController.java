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
	SongCommentRepository songCommentRepo;

	@Autowired
	AlbumCommentRepository albumCommentRepo;

	@RequestMapping("/")
	public String home() {
		return "redirect:/artists";
	}

	@RequestMapping("/artists")
	public String getArtists(Model model) {
		model.addAttribute("artists", artistRepo.findAll());
		return "artists";
	}

	@RequestMapping("/artists/{id}")
	public String getArtist(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("artist", artistRepo.findOne(id));
		return "artist";
	}

	@RequestMapping("/artists/{id}/{albumId}")
	public String getSong(@PathVariable(name="id")Long id,
						@PathVariable(name = "albumId") Long albumId, Model model) {
		model.addAttribute("artist", artistRepo.findOne(id));
		model.addAttribute("album",albumRepo.findOne(albumId));
		return "album";
	}

	@RequestMapping("/artists/{id}/{albumId}/{songId}")
	public String getAlbum(@PathVariable(name="id")Long id,
							@PathVariable(name = "albumId") Long albumId,
							@PathVariable(name = "songId") Long songId,	Model model) {
		model.addAttribute("artist",artistRepo.findOne(id));
		model.addAttribute("album", albumRepo.findOne(albumId));
		model.addAttribute("songs", songRepo.findOne(songId));
		return "songs";
	}

}
