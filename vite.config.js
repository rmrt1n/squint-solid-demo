import { defineConfig } from 'vite'
import solid from 'vite-plugin-solid'

import squint from './vite-plugin-squint'

export default defineConfig({
  plugins: [squint(), solid()],
})
