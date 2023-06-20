import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_get-the-path-of-the-last-downloaded-file'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/get-the-path-of-the-last-downloaded-file/81885')

'step 2: Add visual checkpoint at Page_t_get-the-path-of-the-last-downloaded-file'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00999_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
