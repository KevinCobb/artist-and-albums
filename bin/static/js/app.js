// Create a function to remove a city
const albumList = document.querySelector('.albumList')
	// Create event listener
List.addEventListener('click', removeAlbum)

function removeAlbum(event) {
	if (event.target.classList.contains('delete')) {
		// select delete button
		const deleteButton = event.target
		
		// traverse to city container
		const albumContainer = deleteButton.parentElement
		
		// get 'href' attribute from link
		const hrefArray = albumContainer.querySelector('a').getAttribute('href').split("/")
		const albumName= hrefArray[2]
		const albumId = hrefArray[4]
		
		// set up action for response
		const xhr = new XMLHttpRequest()
		// repopulate list with existing cities (pass response as a parameter)
		xhr.onreadystatechange = function(response) {
			if(xhr.readyState == 4 && xhr.status == 200) {
				const remainingAlbums = JSON.parse(response.currentTarget.response);
				let list = ''
				remainingAlbums.forEach(function(album) {
					// `abbreviation` and `cityId` reference lines 16 & 17
					list += `
						<li>
							<a href="/artists/${name}/albums/${album.id}">
								${album.name}
							</a>
							<!-- Create a .delete button -->
							<button class="deleteArtist">Remove</button>
							<button class="editArtist">Edit</button>
						</li>
					`
				})
				albumList.innerHTML = list
			}
		}
		
		// send request to server
		xhr.open("DELETE", `/api/artists/${name}/albums?id=${albumId}`, true)
		xhr.send()
		
	}
}

