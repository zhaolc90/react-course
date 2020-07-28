import axios from 'axios'

export async function getSortedPostsData() {
  // Instead of the file system,
  // fetch post data from an external API endpoint
  const res = await axios.get('http://localhost:3001/table')
  console.log(res.data)
  return {data:res.data,length:res.data.length}
}



export async function addUser(name, id) {
  // Instead of the file system,
  // fetch post data from an external API endpoint
  const data = {id,name}
  const res = await axios.post('http://localhost:3001/table',data)
  return res.data
}
