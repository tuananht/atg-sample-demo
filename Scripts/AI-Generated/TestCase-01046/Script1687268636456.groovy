import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_editor-could-not-be-initialized-when-trying-to-view-feature-files'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/editor-could-not-be-initialized-when-trying-to-view-feature-files/66074')

'step 2: Add visual checkpoint at Page_t_editor-could-not-be-initialized-when-trying-to-view-feature-files'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01046_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
