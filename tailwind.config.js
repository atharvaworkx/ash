/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      fontFamily: {
        'mono': ['"JetBrains Mono"', 'monospace'],
      },
      colors: {
        'editor-bg': '#1e1e1e',
        'header-bg': '#2d2d30',
        'tab-active': '#3e3e42',
        'tab-hover': '#3e3e42',
      },
    },
  },
  plugins: [],
}
