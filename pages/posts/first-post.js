import React, { Component } from 'react'
import Head from 'next/head'
import Layout from '../../components/Layout'
import {getSortedPostsData, addUser} from '../../lib/api'
import Link from 'next/link'

export default function FirstPost({allPostsData}){
    // allPostsData use as props
    const [name, setName] = React.useState("")
    const submitUser = async ()=>{
        addUser(name, allPostsData.length+1)
    }
    return (
        <Layout>
            <Head>
            <title>First Post</title>
            </Head>
            First Post
            <ul>
            {allPostsData.data.map((x)=>{
                return <li>{x.name}</li>
            })}
            </ul>
            <h2>
                <Link href="/">
                <a>Back to home</a>
                </Link>
            </h2>
            <input value={name} onChange={setName
                // (e)=>setName(e.target.value)
                } />
            <button onClick={submitUser}>submit</button>
        </Layout>
    )
}

export async function getStaticProps() {
    const allPostsData =await getSortedPostsData()
    return {
      props: {
        allPostsData
      }
    }
  }
  