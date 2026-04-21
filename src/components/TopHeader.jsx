import React from 'react'
import { Settings, Menu, Maximize2, X, ChevronDown } from 'lucide-react'

const TopHeader = () => {
  const handleDownloadPDF = async () => {
    try {
      const fileName = 'andriod.com.pdf'
      const filePath = `/logo/${fileName}`
      
      // Method 1: Try fetch with blob (works on most systems)
      try {
        const response = await fetch(filePath)
        if (!response.ok) throw new Error(`HTTP error! status: ${response.status}`)
        const blob = await response.blob()
        
        // Create object URL with proper cleanup
        const url = URL.createObjectURL(blob)
        const link = document.createElement('a')
        link.style.display = 'none'
        link.href = url
        link.download = fileName
        link.setAttribute('target', '_blank')
        link.setAttribute('rel', 'noopener noreferrer')
        
        document.body.appendChild(link)
        
        // Use setTimeout to ensure it works on all systems
        setTimeout(() => {
          link.click()
          document.body.removeChild(link)
          URL.revokeObjectURL(url)
        }, 100)
      } catch (fetchError) {
        // Method 2: Fallback - Direct link download (works on systems without CORS issues)
        console.log('Fetch method failed, trying direct link...', fetchError)
        const link = document.createElement('a')
        link.href = filePath
        link.download = fileName
        link.style.display = 'none'
        document.body.appendChild(link)
        
        setTimeout(() => {
          link.click()
          document.body.removeChild(link)
        }, 100)
      }
    } catch (error) {
      console.error('Download failed:', error)
      alert('Failed to download file. Please try again.')
    }
  }

  return (
    <div className="h-12 bg-header-bg flex items-center justify-between px-4">
      {/* Left Section */}
      <div className="flex items-center gap-1">
        <span className="text-[#cfd8dc] text-sm">Open</span>
        <ChevronDown size={14} className="text-[#cfd8dc]" />
      </div>

      {/* Center Section */}
      <div className="flex flex-col items-center justify-center leading-tight">
        <div className="flex items-center gap-1.5">
          <div className="w-1.5 h-1.5 rounded-full bg-white"></div>
          <span className="text-white text-sm font-medium">package main.go</span>
        </div>
        <span className="text-[#90a4ae] text-xs">~/Downloads</span>
      </div>

      {/* Right Section - Window Controls */}
      <div className="flex items-center gap-3.5">
        <button 
          onClick={handleDownloadPDF}
          className="w-7 h-7 flex items-center justify-center rounded-full hover:bg-tab-hover transition-colors cursor-pointer"
          title="Download PDF"
        >
          <Settings size={18} className="text-[#cfd8dc]" />
        </button>
        <button className="w-7 h-7 flex items-center justify-center rounded-full hover:bg-tab-hover transition-colors">
          <Menu size={18} className="text-[#cfd8dc]" />
        </button>
        <button className="w-7 h-7 flex items-center justify-center rounded-full hover:bg-tab-hover transition-colors">
          <Maximize2 size={18} className="text-[#cfd8dc]" />
        </button>
        <button className="w-7 h-7 flex items-center justify-center rounded-full hover:bg-[#e53935] transition-colors">
          <X size={18} className="text-[#cfd8dc]" />
        </button>
      </div>
    </div>
  )
}

export default TopHeader
