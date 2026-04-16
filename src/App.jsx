import React from 'react'
import TopHeader from './components/TopHeader'
import TabBar from './components/TabBar'
import Editor from './components/Editor'

function App() {
  return (
    <div className="w-full h-screen bg-editor-bg flex flex-col font-mono">
      <TopHeader />
      <TabBar />
      <Editor />
    </div>
  )
}

export default App
