import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-upload-a-file-from-windows-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-upload-a-file-from-windows-explorer/6457/6')

'step 2: Add visual checkpoint at Page_t_how-to-upload-a-file-from-windows-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00311_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
