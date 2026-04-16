import React from 'react'
import { X } from 'lucide-react'

const TabBar = () => {
  const tabs = [
    { name: 'admin_image_upload_guide.md', active: false },
    { name: 'Revert the changes.md', active: false },
    { name: 'package main.go', active: true },
  ]

  return (
    <div className="h-11 bg-header-bg flex items-center gap-3 pl-[120px]">
      {tabs.map((tab, index) => (
        <div
          key={index}
          className={`flex items-center gap-2 px-4 py-2 text-[13px] transition-colors ${
            tab.active
              ? 'bg-tab-active text-white rounded-lg'
              : 'text-[#90a4ae] hover:text-white'
          }`}
        >
          {tab.active && (
            <div className="w-1.5 h-1.5 rounded-full bg-white"></div>
          )}
          <span>{tab.name}</span>
          {tab.active && (
            <X size={14} className="text-[#90a4ae] hover:text-white cursor-pointer" />
          )}
        </div>
      ))}
    </div>
  )
}

export default TabBar
