import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-free-a-project-from-annoying-and-time-consuming-ballast'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-free-a-project-from-annoying-and-time-consuming-ballast/19020')

'step 2: Add visual checkpoint at Page_t_how-to-free-a-project-from-annoying-and-time-consuming-ballast'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00578_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
