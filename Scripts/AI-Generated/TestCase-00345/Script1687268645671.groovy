import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_can-i-loop-over-an-object-repository-folder'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/can-i-loop-over-an-object-repository-folder/9981')

'step 2: Add visual checkpoint at Page_t_can-i-loop-over-an-object-repository-folder'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00345_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
