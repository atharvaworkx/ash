import React from 'react'

const Editor = () => {
  return (
    <div className="flex-1 bg-editor-bg overflow-auto">
      <pre className="p-6 text-[14px] leading-[1.6] font-mono">
        <code>
          <span className="text-[#ffb74d]">package</span> <span className="text-white">main</span>
          {'\n\n'}
          <span className="text-[#ffb74d]">import</span> <span className="text-[#66bb6a]">"fmt"</span>
          {'\n\n'}
          <span className="text-[#ffb74d]">func</span> <span className="text-[#42a5f5]">main</span><span className="text-[#cfd8dc]">()</span> <span className="text-[#cfd8dc]">{'{'}</span>
          {'\n'}
          {'    '}<span className="text-[#ffb74d]">var</span> <span className="text-[#90caf9]">n</span> <span className="text-[#ffb74d]">int</span>
          {'\n\n'}
          {'    '}<span className="text-[#90caf9]">fmt</span>.<span className="text-[#42a5f5]">Print</span><span className="text-[#cfd8dc]">(</span><span className="text-[#66bb6a]">"Enter number of elements: "</span><span className="text-[#cfd8dc]">)</span>
          {'\n'}
          {'    '}<span className="text-[#90caf9]">fmt</span>.<span className="text-[#42a5f5]">Scan</span><span className="text-[#cfd8dc]">(</span><span className="text-[#ffb74d]">&</span><span className="text-[#90caf9]">n</span><span className="text-[#cfd8dc]">)</span>
          {'\n\n'}
          {'    '}<span className="text-[#ffb74d]">var</span> <span className="text-[#90caf9]">arr</span> <span className="text-[#cfd8dc]">[</span><span className="text-[#ef5350]">100</span><span className="text-[#cfd8dc]">]</span><span className="text-[#ffb74d]">int</span>
          {'\n\n'}
          {'    '}<span className="text-[#90caf9]">fmt</span>.<span className="text-[#42a5f5]">Println</span><span className="text-[#cfd8dc]">(</span><span className="text-[#66bb6a]">"Enter elements:"</span><span className="text-[#cfd8dc]">)</span>
          {'\n'}
          {'    '}<span className="text-[#ffb74d]">for</span> <span className="text-[#90caf9]">i</span> <span className="text-[#ffb74d]">:=</span> <span className="text-[#ef5350]">0</span><span className="text-[#cfd8dc]">;</span> <span className="text-[#90caf9]">i</span> <span className="text-[#ffb74d]">&lt;</span> <span className="text-[#90caf9]">n</span><span className="text-[#cfd8dc]">;</span> <span className="text-[#90caf9]">i</span><span className="text-[#ffb74d]">++</span> <span className="text-[#cfd8dc]">{'{'}</span>
          {'\n'}
          {'        '}<span className="text-[#90caf9]">fmt</span>.<span className="text-[#42a5f5]">Scan</span><span className="text-[#cfd8dc]">(</span><span className="text-[#ffb74d]">&</span><span className="text-[#90caf9]">arr</span><span className="text-[#cfd8dc]">[</span><span className="text-[#90caf9]">i</span><span className="text-[#cfd8dc]">])</span>
          {'\n'}
          {'    '}<span className="text-[#cfd8dc]">{'}'}</span>
          {'\n\n'}
          {'    '}<span className="text-[#ffb74d]">for</span> <span className="text-[#90caf9]">i</span> <span className="text-[#ffb74d]">:=</span> <span className="text-[#ef5350]">0</span><span className="text-[#cfd8dc]">;</span> <span className="text-[#90caf9]">i</span> <span className="text-[#ffb74d]">&lt;</span> <span className="text-[#90caf9]">n</span><span className="text-[#ffb74d]">-</span><span className="text-[#ef5350]">1</span><span className="text-[#cfd8dc]">;</span> <span className="text-[#90caf9]">i</span><span className="text-[#ffb74d]">++</span> <span className="text-[#cfd8dc]">{'{'}</span>
          {'\n'}
          {'        '}<span className="text-[#ffb74d]">for</span> <span className="text-[#90caf9]">j</span> <span className="text-[#ffb74d]">:=</span> <span className="text-[#ef5350]">0</span><span className="text-[#cfd8dc]">;</span> <span className="text-[#90caf9]">j</span> <span className="text-[#ffb74d]">&lt;</span> <span className="text-[#90caf9]">n</span><span className="text-[#ffb74d]">-</span><span className="text-[#90caf9]">i</span><span className="text-[#ffb74d]">-</span><span className="text-[#ef5350]">1</span><span className="text-[#cfd8dc]">;</span> <span className="text-[#90caf9]">j</span><span className="text-[#ffb74d]">++</span> <span className="text-[#cfd8dc]">{'{'}</span>
          {'\n'}
          {'            '}<span className="text-[#ffb74d]">if</span> <span className="text-[#90caf9]">arr</span><span className="text-[#cfd8dc]">[</span><span className="text-[#90caf9]">j</span><span className="text-[#cfd8dc]">]</span> <span className="text-[#ffb74d]">&gt;</span> <span className="text-[#90caf9]">arr</span><span className="text-[#cfd8dc]">[</span><span className="text-[#90caf9]">j</span><span className="text-[#ffb74d]">+</span><span className="text-[#ef5350]">1</span><span className="text-[#cfd8dc]">]</span> <span className="text-[#cfd8dc]">{'{'}</span>
          {'\n'}
          {'                '}<span className="text-[#90caf9]">temp</span> <span className="text-[#ffb74d]">:=</span> <span className="text-[#90caf9]">arr</span><span className="text-[#cfd8dc]">[</span><span className="text-[#90caf9]">j</span><span className="text-[#cfd8dc]">]</span>
          {'\n'}
          {'                '}<span className="text-[#90caf9]">arr</span><span className="text-[#cfd8dc]">[</span><span className="text-[#90caf9]">j</span><span className="text-[#cfd8dc]">]</span> <span className="text-[#ffb74d]">=</span> <span className="text-[#90caf9]">arr</span><span className="text-[#cfd8dc]">[</span><span className="text-[#90caf9]">j</span><span className="text-[#ffb74d]">+</span><span className="text-[#ef5350]">1</span><span className="text-[#cfd8dc]">]</span>
          {'\n'}
          {'                '}<span className="text-[#90caf9]">arr</span><span className="text-[#cfd8dc]">[</span><span className="text-[#90caf9]">j</span><span className="text-[#ffb74d]">+</span><span className="text-[#ef5350]">1</span><span className="text-[#cfd8dc]">]</span> <span className="text-[#ffb74d]">=</span> <span className="text-[#90caf9]">temp</span>
          {'\n'}
          {'            '}<span className="text-[#cfd8dc]">{'}'}</span>
          {'\n'}
          {'        '}<span className="text-[#cfd8dc]">{'}'}</span>
          {'\n'}
          {'    '}<span className="text-[#cfd8dc]">{'}'}</span>
          {'\n\n'}
          {'    '}<span className="text-[#90caf9]">fmt</span>.<span className="text-[#42a5f5]">Println</span><span className="text-[#cfd8dc]">(</span><span className="text-[#66bb6a]">"Sorted array in ascending order:"</span><span className="text-[#cfd8dc]">)</span>
          {'\n'}
          {'    '}<span className="text-[#ffb74d]">for</span> <span className="text-[#90caf9]">i</span> <span className="text-[#ffb74d]">:=</span> <span className="text-[#ef5350]">0</span><span className="text-[#cfd8dc]">;</span> <span className="text-[#90caf9]">i</span> <span className="text-[#ffb74d]">&lt;</span> <span className="text-[#90caf9]">n</span><span className="text-[#cfd8dc]">;</span> <span className="text-[#90caf9]">i</span><span className="text-[#ffb74d]">++</span> <span className="text-[#cfd8dc]">{'{'}</span>
          {'\n'}
          {'        '}<span className="text-[#90caf9]">fmt</span>.<span className="text-[#42a5f5]">Print</span><span className="text-[#cfd8dc]">(</span><span className="text-[#90caf9]">arr</span><span className="text-[#cfd8dc]">[</span><span className="text-[#90caf9]">i</span><span className="text-[#cfd8dc]">]</span>, <span className="text-[#66bb6a]">" "</span><span className="text-[#cfd8dc]">)</span>
          {'\n'}
          {'    '}<span className="text-[#cfd8dc]">{'}'}</span>
          {'\n'}
          <span className="text-[#cfd8dc]">{'}'}</span>
        </code>
      </pre>
    </div>
  )
}

export default Editor
