import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_download-multiple-pdf-files-from-website'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/download-multiple-pdf-files-from-website/49887')

'step 2: Add visual checkpoint at Page_t_download-multiple-pdf-files-from-website'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00454_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
