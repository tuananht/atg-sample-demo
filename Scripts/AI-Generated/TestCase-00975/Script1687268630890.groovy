import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-update-globalvariable'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-update-globalvariable/56220')

'step 2: Add visual checkpoint at Page_t_how-to-update-globalvariable'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00975_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
