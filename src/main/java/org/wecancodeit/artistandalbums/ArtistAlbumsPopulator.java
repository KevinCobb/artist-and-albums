package org.wecancodeit.artistandalbums;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service

public class ArtistAlbumsPopulator implements CommandLineRunner {

	@Autowired
	ArtistRepository artistRepo;
	@Autowired
	AlbumRepository albumRepo;
	@Autowired
	SongRepository songRepo;
	
	@Override
	public void run(String... args) throws Exception {

		Artist philCollins = artistRepo.save(new Artist("Phil Collins", "VirginAtlantic"));
		Artist metallica = artistRepo.save(new Artist("Metallica", "Elektra"));
		Artist aboveAndbeyond = artistRepo.save(new Artist("Above & Beyond", "AnjunaBeats"));
		Artist michaelBuble = artistRepo.save(new Artist("Michael Buble", "Reprize"));
		
		Album butSeriously = albumRepo.save(new Album("But Seriously", "November 20th 1989", "albumsongs", "Pop",
				"img/philSeriouslyAlbum.jpg", philCollins));
		Album masterOfPuppets = albumRepo.save(new Album("Masters of Puppets", "March 3rd 1986", "albumSongs",
				"Heavy Metal", "img/metallicMastersAlbum.jpg", metallica));
		Album commonGround = albumRepo.save(new Album("Common Ground", "January 26 2018", "albumsongs", "EDM",
				"img/A&BcommonAlbum.jpg", aboveAndbeyond));
		Album toBeLoved = albumRepo.save(new Album("To Be Loved", "April 22nd 2013", "album songs", "Vocal Jazz",
				"img/BubleLovedAlbum.jpg", michaelBuble));
		
		Song itsABeautifulDay = songRepo.save(new Song("It's a beautiful day", "3:15", "lyrics", "videoUrl", "4.5", toBeLoved));
		Song anotherDayInParadise = songRepo.save(new Song("Another day In Paradise", "2:54", "lyrics", "vidUrl", "5", butSeriously));
		Song disposableHeroes = songRepo.save(new Song("disposable Heroes", "4:02", "lyrics", "vidUrl", "4.0", masterOfPuppets)); 
		Song tightRope = songRepo.save(new Song("Tightrope", "4:22", "lyrics", "vidUrl", "5", commonGround));
	}


}