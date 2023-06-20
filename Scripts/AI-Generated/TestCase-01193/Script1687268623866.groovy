import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-open-project-due-to-missing-11'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-open-project-due-to-missing-temptestsuite/38750/11')

'step 2: Add visual checkpoint at Page_t_unable-to-open-project-due-to-missing-11'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01193_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
