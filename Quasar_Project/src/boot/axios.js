import axios from 'axios'

const axiosInstance = axios.create({
  baseURL: 'http://192.168.43.15:5000'
})

export default async ({ Vue }) => {
  Vue.prototype.$axios = axiosInstance
}
export { axiosInstance }
