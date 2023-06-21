import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-use-the-robot-framework-to-load-files-using-a-custom-keyword'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-use-the-robot-framework-to-load-files-using-a-custom-keyword/24108')

'step 2: Add visual checkpoint at Page_t_how-to-use-the-robot-framework-to-load-files-using-a-custom-keyword'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00125_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
