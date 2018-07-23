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

		Artist philCollins = artistRepo.save(new Artist("Phil Collins", "VirginAtlantic", "phil.jpg"));
		Artist metallica = artistRepo.save(new Artist("Metallica", "Elektra", "metallica.jpg"));
		Artist aboveAndbeyond = artistRepo.save(new Artist("Above & Beyond", "AnjunaBeats", "above.jpg"));
		Artist michaelBuble = artistRepo.save(new Artist("Michael Buble", "Reprize", "buble.jpg"));
		
		Album butSeriously = albumRepo.save(new Album("But Seriously", "November 20th 1989", "albumsongs", "Pop",
				"philSeriouslyAlbum.jpg", philCollins));
		Album masterOfPuppets = albumRepo.save(new Album("Masters of Puppets", "March 3rd 1986", "albumSongs",
				"Heavy Metal", "metallicaMastersAlbum.jpg", metallica));
		Album commonGround = albumRepo.save(new Album("Common Ground", "January 26 2018", "albumsongs", "EDM",
				"A&BcommonAlbum.jpg", aboveAndbeyond));
		Album toBeLoved = albumRepo.save(new Album("To Be Loved", "April 22nd 2013", "album songs", "Vocal Jazz",
				"BubleLovedAlbum.jpg", michaelBuble));
		
		Song itsABeautifulDay = songRepo.save(new Song("It's a beautiful day", "3:15", "lyrics", "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/RglMIKG0GFw\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>", "4.5", toBeLoved));
		Song anotherDayInParadise = songRepo.save(new Song("Another day In Paradise", "2:54", "lyrics: ", "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Qt2mbGP6vFI\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>", "5", butSeriously));
		Song disposableHeroes = songRepo.save(new Song("disposable Heroes", "4:02", "[Verse 1]\r\n" + 
				"Bodies fill the fields I see, hungry heroes end\r\n" + 
				"No one to play soldier now, no one to pretend\r\n" + 
				"Running blind through killing fields, bred to kill them all\r\n" + 
				"Victim of what said should be, a servant until I fall\r\n" + 
				"\r\n" + 
				"[Pre-Chorus]\r\n" + 
				"Soldier boy, made of clay\r\n" + 
				"Now an empty shell\r\n" + 
				"Twenty-one, only son\r\n" + 
				"But he served us well\r\n" + 
				"Bred to kill, not to care\r\n" + 
				"Do just as we say\r\n" + 
				"Finished here, greetings death\r\n" + 
				"He's yours to take away\r\n" + 
				"\r\n" + 
				"[Chorus]\r\n" + 
				"Back to the front\r\n" + 
				"You will do what I say, when I say\r\n" + 
				"Back to the front\r\n" + 
				"You will die when I say, you must die\r\n" + 
				"Back to the front\r\n" + 
				"You coward, you servant, you blind man\r\n" + 
				"\r\n" + 
				"[Verse 2]\r\n" + 
				"Barking of machine-gun fire, does nothing to me now\r\n" + 
				"Sounding of the clock that ticks, get used to it somehow\r\n" + 
				"More a man, more stripes you wear, glory seeker trends\r\n" + 
				"Bodies fill the fields I see\r\n" + 
				"The slaughter never ends", "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/IYaRQKF0mpk\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>", "4.0", masterOfPuppets)); 
		Song tightRope = songRepo.save(new Song("Tightrope", "4:22", "lyrics", "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/18x3S2KCA1o\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>", "5", commonGround));
	}


}