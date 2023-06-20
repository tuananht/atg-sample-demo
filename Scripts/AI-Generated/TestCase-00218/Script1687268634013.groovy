import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_the-project-cannot-be-built-until-build-path-errors-are-resolved-java-problem'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/the-project-cannot-be-built-until-build-path-errors-are-resolved-java-problem/49643')

'step 2: Add visual checkpoint at Page_t_the-project-cannot-be-built-until-build-path-errors-are-resolved-java-problem'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00218_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
