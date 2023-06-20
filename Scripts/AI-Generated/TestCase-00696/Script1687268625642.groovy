import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-pass-bollean-as-a-parameter-into-7'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-pass-bollean-as-a-parameter-into-calltestcase/61523/7')

'step 2: Add visual checkpoint at Page_t_how-to-pass-bollean-as-a-parameter-into-7'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00696_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
